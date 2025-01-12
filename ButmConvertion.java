public class ButmConvertion {
	/**
	 * Global Constant
	 */
	double pi = 3.1415926535898; // ---------definition of pi=4 * Atn(1)
	double cdr = pi / 180; // '---------factor to convert degree to radian
	double crd = 180 / pi; // '---------factor to convert radian to degree
	double ae = 6377276.345; // '----------semi-major axis in meter
	double ae_yd = 6974310.6; // '----------semi-major axis in yd
	double fe = 1 / 300.8017; // '----------reciprocal flattening
	double be = ae * (1 - fe); // '----------semi-minor axis
	double e2e = fe * (2 - fe); // '----------first ecentricity squared
	double se2e = e2e / Math.pow((1 - fe), 2); // '-------second ecentricity
												// squared
	double ce = ae / (1 - fe); // '---------polar radius of curvatureli
	double ce_yd = ae_yd / (1 - fe); // '-------polar radius of curvature
	double ne = fe / (2 - fe); // '-----second flattening
	double re = ae * (1 + Math.pow(ne, 2) / 4) / (1 + ne); // '-----radius of
															// the rectifying
															// sphere
	double ltsd_e, lnsd_e;
	double ltsr_e, lnsr_e;

	double w_r, lt_fp; // '.... rectifying latitude(r_w) and meridian
						// dist.(S_md)
	double So_md, S_md; // '.... rectifying latitude(r_w) and meridian
						// dist.(S_md)

	/**
	 * Constant for Lambert Grid.
	 */
	int ltod_L = 26;
	int lnod_L = 90;
	double ko_L = 823 / 824;
	double ltor_L = ltod_L * cdr;
	double lnor_L = lnod_L * cdr;
	int FE_L = 3000000;
	int FN_L = 1000000;
	double tmd;
	double cnv_L, ks_L;
	double M_L;
	double Es_L, Ns_L;
	double Ns;
	double Po_L, Vo_L, Ro_L;
	double dm1_L, dm2_L; // '.....Const.for Developed Meridian Dist.
	double dm3_L;
	double A0, A2, A4;
	double A6, A8, A10;

	double db0, db2, db4;
	double db6, db8, db10;

	/**
	 * Constant for BUTM .
	 */

	int ltod_U = 0;
	int lnod_U = 90; // '..... Central Meridian in degree
	double ko_U = 0.9996;
	double ltor_U = ltod_U * cdr;
	double lnor_U = lnod_U * cdr;
	double FE_U = 500000;
	int FN_U = 0;

	public void MeridDist_Forward(double ltsr) {
		double u2f;
		double u4f;
		double u6f;
		double u8f;
		double w_rl;

		u2f = ce
				* (((((-86625 / 8 * se2e + 11025) / 64 * se2e - 175) / 4 * se2e + 45)
						/ 16 * se2e - 3) / 4 * se2e);
		u4f = ce
				* ((((-17325 / 4 * se2e + 3675) / 256 * se2e - 175 / 12) * se2e + 15) / Math
						.pow(32 * se2e, 2));
		u6f = ce * ((-1493 / 2 + 735 * se2e) / Math.pow((2048 * se2e), 3));
		u8f = ce * ((-3465 / 4 * se2e + 315) / Math.pow((1024 * se2e), 4));

		w_rl = ltsr
				* re
				+ Math.sin(ltsr)
				* Math.cos(ltsr)
				* (u2f + Math.pow((u4f * Math.cos(ltsr)), 2)
						+ Math.pow(u6f * Math.cos(ltsr), 4) + Math.pow(
						(u8f * Math.cos(ltsr)), 6));
		S_md = ko_U * w_rl;
	}

	public double dms_dval(double dms) {
		double dms_dval;
		double d_part_float;
		double m_part_float;
		double d_part;
		double m_part;
		double s_part;
		int d_part_int;
		int m_part_int;
		d_part_float = dms / 10000;
		d_part_int = (int)d_part_float;
		System.out.println("Output d_part_int  "+d_part_int);
		m_part_float = dms / 100 - d_part_int * 100;
		m_part_int = (int)m_part_float;
		System.out.println("Output m_part_int  "+m_part_int);
		s_part = (dms / 100 - d_part_int * 100 - m_part_int) * 100;
		System.out.println("Output s_part  "+s_part);
		dms_dval = d_part_int + m_part_int / 60 + s_part / 3600;
		System.out.println("Output dms_dval  "+dms_dval);
		return dms_dval;

	}

	public void EV1830_BUTMGRID(){
		//'------------------------------------Calculation of BUTM Grid

		double dlnr_U1;
		double L_U1;
		double T_U1;
		double C_U1;
		double R_U1;
		double M_U1;
		double A1_U1;
		double A2_U1;
		double A3_U1;
		double A4_U1;
		double A5_U1;
		double A6_U1;
		double A7_U1;
		double C1_U1;
		double C3_U1;
		double C5_U1;
		double C2_U1;
		double C4_U1;
		double Es_U1;
		double Ns_U1;
		double cnvr_U1;
		double ks_U1;
		double cnvd_U1;


		ltsd_e = dms_dval(235738.75) ;  //'------------------------------------passing the value through dms_dval function
		lnsd_e = dms_dval(910545.99) ;  //'------------------------------------passing the value through dms_dval function
		System.out.println("Output ltsd_e  "+ltsd_e);
		System.out.println("Output dms_dval  "+lnsd_e);
		ltsr_e = ltsd_e * cdr;
		lnsr_e = lnsd_e * cdr;
		dlnr_U1 = lnor_U - lnsr_e;


		L_U1 = dlnr_U1 * Math.cos(ltsr_e);                           //'.....L
		T_U1 = Math.pow((Math.tan(ltsr_e)), 2)  ;                                 //'.....t
		C_U1 = se2e * Math.pow((Math.cos(ltsr_e)), 2)   ;                        // '.....n
		R_U1 = ko_U * ae / Math.pow((Math.pow((1 - e2e * Math.sin(ltsr_e)), 2)), .05);    //'

		MeridDist_Forward(ltsr_e)  ;                         //' calling function MeridDist_Forward
		M_U1 = S_md;

		A1_U1 = -R_U1;
		A3_U1 = (1 - T_U1 + C_U1);
		A5_U1 = (5 - 18 * T_U1 + Math.pow(T_U1, 2) + C_U1 * (14 - 58 * T_U1));
		A7_U1 = (61 - 479 * T_U1 + Math.pow((179 * T_U1), 2) - Math.pow(T_U1, 3));

		A2_U1 = Math.pow((R_U1 * T_U1), .05);
		A4_U1 = (5 - T_U1 + C_U1 * (9 + 4 * C_U1));
		A6_U1 = (61 - 58 * T_U1 + Math.pow(T_U1, 2)+ C_U1 * (270 - 330 * T_U1));

		C1_U1 = -(Math.pow(T_U1, 0.5));
		C3_U1 = (1 + 3 * C_U1 + Math.pow((2 * C_U1), 2));
		C5_U1 = (2 - T_U1);

		C2_U1 = (1 + C_U1);
		C4_U1 = (5 - 4 * T_U1 + C_U1 * (9 - 24 * T_U1));


		Es_U1 = FE_U + A1_U1 * L_U1 * (1 + Math.pow((A3_U1 * L_U1), 2) / 6 + Math.pow((A5_U1 * L_U1), 4)/ 120 + Math.pow((A7_U1 * L_U1), 6) / 5040);
		Ns_U1 = FN_U + M_U1 + A2_U1 / Math.pow((2 * L_U1 ), 2) * (1 + Math.pow(L_U1, 2) / 12 * (A4_U1 + A6_U1 / Math.pow((30 * L_U1), 2)));


		ks_U1 = ko_U * (1 + C2_U1 / Math.pow((2 * L_U1), 2) * (1 + C4_U1 / Math.pow((12 * L_U1), 2) ));
		cnvr_U1 = C1_U1 * L_U1 * (1 + (Math.pow(L_U1, 2) / 3) * (C3_U1 + (C5_U1 / 5) * Math.pow(L_U1, 2)));
	 		cnvd_U1 =Math.abs(cnvr_U1 * crd);  //'-----------------------Absolute Value function

	 		System.out.println("Output easting  "+ks_U1);

	 		System.out.println("Output Northing  "+Ns_U1);

	}

	public static void main(String []args){

		ButmConvertion convertion=new ButmConvertion();
		convertion.EV1830_BUTMGRID();
	   }
}

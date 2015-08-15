// Andy's Workshop Open Source Reflow Controller
// Copyright (c) 2015 Andy Brown. All rights Reserved.
// Please see website (http://www.andybrown.me.uk) for full license details.

package uk.me.andybrown.awreflow2;

/**
 * Default profile for leaded
 */

public class LeadFreeReflowProfile extends ReflowProfile {

  /**
   * Constructor
   */

  public LeadFreeReflowProfile() {
    super(
      "JEDEC J-STD-020D.1 Lead Free",
        new ReflowRegion[] {
                new ReflowRegion("Preheat",90,150),
                new ReflowRegion("Soak",180,217),
                new ReflowRegion("Ramp up",200,240),
                new ReflowRegion("Reflow",220,240),
                new ReflowRegion("Ramp down",240,217),
                new ReflowRegion("Cool down",270,25)
        },
        new double[] {
                25,
                26.39,
                27.79,
                29.20,
                30.61,
                32.03,
                33.45,
                34.88,
                36.32,
                37.76,
                39.21,
                40.66,
                42.11,
                43.57,
                45.04,
                46.50,
                47.98,
                49.45,
                50.93,
                52.41,
                53.89,
                55.38,
                56.86,
                58.35,
                59.85,
                61.34,
                62.83,
                64.33,
                65.82,
                67.32,
                68.81,
                70.31,
                71.81,
                73.30,
                74.80,
                76.29,
                77.78,
                79.28,
                80.76,
                82.25,
                83.74,
                85.22,
                86.70,
                88.18,
                89.65,
                91.13,
                92.59,
                94.06,
                95.52,
                96.97,
                98.42,
                99.87,
                101.31,
                102.75,
                104.18,
                105.60,
                107.02,
                108.43,
                109.84,
                111.24,
                112.63,
                114.01,
                115.39,
                116.76,
                118.13,
                119.48,
                120.83,
                122.16,
                123.49,
                124.81,
                126.12,
                127.42,
                128.71,
                129.99,
                131.26,
                132.52,
                133.77,
                135.01,
                136.24,
                137.45,
                138.66,
                139.85,
                141.03,
                142.20,
                143.35,
                144.49,
                145.62,
                146.74,
                147.84,
                148.93,
                150,
                151.0622318,
                152.1156324,
                153.1602593,
                154.1961701,
                155.2234225,
                156.2420741,
                157.2521824,
                158.2538052,
                159.247,
                160.2318244,
                161.2083361,
                162.1765926,
                163.1366516,
                164.0885706,
                165.0324074,
                165.9682195,
                166.8960645,
                167.816,
                168.7280837,
                169.6323731,
                170.5289259,
                171.4177997,
                172.2990521,
                173.1727407,
                174.0389232,
                174.8976571,
                175.749,
                176.5930096,
                177.4297435,
                178.2592593,
                179.0816145,
                179.8968669,
                180.7050741,
                181.5062936,
                182.300583,
                183.088,
                183.8686022,
                184.6424472,
                185.4095926,
                186.170096,
                186.9240151,
                187.6714074,
                188.4123306,
                189.1468422,
                189.875,
                190.5968615,
                191.3124842,
                192.0219259,
                192.7252442,
                193.4224966,
                194.1137407,
                194.7990343,
                195.4784348,
                196.152,
                196.8197874,
                197.4818546,
                198.1382593,
                198.789059,
                199.4343114,
                200.0740741,
                200.7084047,
                201.3373608,
                201.961,
                202.57938,
                203.1925583,
                203.8005926,
                204.4035405,
                205.0014595,
                205.5944074,
                206.1824417,
                206.76562,
                207.344,
                207.9176392,
                208.4865953,
                209.0509259,
                209.6106886,
                210.165941,
                210.7167407,
                211.2631454,
                211.8052126,
                212.343,
                212.8765652,
                213.4059657,
                213.9312593,
                214.4525034,
                214.9697558,
                215.4830741,
                215.9925158,
                216.4981385,
                217,
                218.3255818,
                219.6926085,
                221.091092,
                222.5110447,
                223.9424786,
                225.375406,
                226.7998388,
                228.2057894,
                229.5832698,
                230.9222922,
                232.2128688,
                233.4450117,
                234.6087331,
                235.694045,
                236.6909597,
                237.5894893,
                238.379646,
                239.0514419,
                239.5948892,
                240,
                240.54625,
                241.035,
                241.46625,
                241.84,
                242.15625,
                242.415,
                242.61625,
                242.76,
                242.84625,
                242.875,
                242.84625,
                242.76,
                242.61625,
                242.415,
                242.15625,
                241.84,
                241.46625,
                241.035,
                240.54625,
                240,
                239.6733465,
                239.377836,
                239.0938334,
                238.8017035,
                238.4818111,
                238.114521,
                237.680198,
                237.159207,
                236.5319127,
                235.77868,
                234.8798737,
                233.8158586,
                232.5669996,
                231.1136614,
                229.4362089,
                227.5150069,
                225.3304201,
                222.8628136,
                220.0925519,
                217,
                213.2320185,
                209.1072593,
                204.6445,
                199.8625185,
                194.7800926,
                189.416,
                183.7890185,
                177.9179259,
                171.8215,
                165.5185185,
                159.0277593,
                152.368,
                145.5580185,
                138.6165926,
                131.5625,
                124.4145185,
                117.1914259,
                109.912,
                102.5950185,
                95.25925926,
                87.9235,
                80.60651852,
                73.32709259,
                66.104,
                58.95601852,
                51.90192593,
                44.9605,
                38.15051852,
                31.49075926,
                25
      });
  }
}

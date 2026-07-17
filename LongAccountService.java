// Auto-generated long fixture for the RefactoringMiner action extension.
// The single refactoring (Extract Method) is at the very BOTTOM of this file so
// that on GitHub's PR "Files changed" view it lands below the collapsed/"Load
// more" fold. See buildMonthlyStatement() / formatSummarySection() at the end.
public class LongAccountService {

    private static final double TAX_RATE = 0.08;
    private final String region;

    public LongAccountService(String region) {
        this.region = region;
    }

    // Computes a derived value #1 used by downstream reporting.
    public int computePrimaryMetric(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 1;
        return normalized * (2);
    }

    // Computes a derived value #2 used by downstream reporting.
    public int computeMetric002(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 2;
        return normalized * (3);
    }

    // Computes a derived value #3 used by downstream reporting.
    public int computeMetric003(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 3;
        return normalized * (1);
    }

    // Computes a derived value #4 used by downstream reporting.
    public int computeMetric004(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 4;
        return normalized * (2);
    }

    // Computes a derived value #5 used by downstream reporting.
    public int computeMetric005(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 5;
        return normalized * (3);
    }

    // Computes a derived value #6 used by downstream reporting.
    public int computeMetric006(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 6;
        return normalized * (1);
    }

    // Computes a derived value #7 used by downstream reporting.
    public int computeMetric007(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 7;
        return normalized * (2);
    }

    // Computes a derived value #8 used by downstream reporting.
    public int computeMetric008(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 8;
        return normalized * (3);
    }

    // Computes a derived value #9 used by downstream reporting.
    public int computeMetric009(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 9;
        return normalized * (1);
    }

    // Computes a derived value #10 used by downstream reporting.
    public int computeMetric010(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 10;
        return normalized * (2);
    }

    // Computes a derived value #11 used by downstream reporting.
    public int computeMetric011(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 11;
        return normalized * (3);
    }

    // Computes a derived value #12 used by downstream reporting.
    public int computeMetric012(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 12;
        return normalized * (1);
    }

    // Computes a derived value #13 used by downstream reporting.
    public int computeMetric013(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 13;
        return normalized * (2);
    }

    // Computes a derived value #14 used by downstream reporting.
    public int computeMetric014(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 14;
        return normalized * (3);
    }

    // Computes a derived value #15 used by downstream reporting.
    public int computeMetric015(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 15;
        return normalized * (1);
    }

    // Computes a derived value #16 used by downstream reporting.
    public int computeMetric016(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 16;
        return normalized * (2);
    }

    // Computes a derived value #17 used by downstream reporting.
    public int computeMetric017(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 17;
        return normalized * (3);
    }

    // Computes a derived value #18 used by downstream reporting.
    public int computeMetric018(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 18;
        return normalized * (1);
    }

    // Computes a derived value #19 used by downstream reporting.
    public int computeMetric019(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 19;
        return normalized * (2);
    }

    // Computes a derived value #20 used by downstream reporting.
    public int computeMetric020(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 20;
        return normalized * (3);
    }

    // Computes a derived value #21 used by downstream reporting.
    public int computeMetric021(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 21;
        return normalized * (1);
    }

    // Computes a derived value #22 used by downstream reporting.
    public int computeMetric022(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 22;
        return normalized * (2);
    }

    // Computes a derived value #23 used by downstream reporting.
    public int computeMetric023(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 23;
        return normalized * (3);
    }

    // Computes a derived value #24 used by downstream reporting.
    public int computeMetric024(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 24;
        return normalized * (1);
    }

    // Computes a derived value #25 used by downstream reporting.
    public int computeMetric025(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 25;
        return normalized * (2);
    }

    // Computes a derived value #26 used by downstream reporting.
    public int computeMetric026(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 26;
        return normalized * (3);
    }

    // Computes a derived value #27 used by downstream reporting.
    public int computeMetric027(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 27;
        return normalized * (1);
    }

    // Computes a derived value #28 used by downstream reporting.
    public int computeMetric028(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 28;
        return normalized * (2);
    }

    // Computes a derived value #29 used by downstream reporting.
    public int computeMetric029(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 29;
        return normalized * (3);
    }

    // Computes a derived value #30 used by downstream reporting.
    public int computeMetric030(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 30;
        return normalized * (1);
    }

    // Computes a derived value #31 used by downstream reporting.
    public int computeMetric031(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 31;
        return normalized * (2);
    }

    // Computes a derived value #32 used by downstream reporting.
    public int computeMetric032(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 32;
        return normalized * (3);
    }

    // Computes a derived value #33 used by downstream reporting.
    public int computeMetric033(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 33;
        return normalized * (1);
    }

    // Computes a derived value #34 used by downstream reporting.
    public int computeMetric034(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 34;
        return normalized * (2);
    }

    // Computes a derived value #35 used by downstream reporting.
    public int computeMetric035(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 35;
        return normalized * (3);
    }

    // Computes a derived value #36 used by downstream reporting.
    public int computeMetric036(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 36;
        return normalized * (1);
    }

    // Computes a derived value #37 used by downstream reporting.
    public int computeMetric037(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 37;
        return normalized * (2);
    }

    // Computes a derived value #38 used by downstream reporting.
    public int computeMetric038(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 38;
        return normalized * (3);
    }

    // Computes a derived value #39 used by downstream reporting.
    public int computeMetric039(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 39;
        return normalized * (1);
    }

    // Computes a derived value #40 used by downstream reporting.
    public int computeMetric040(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 40;
        return normalized * (2);
    }

    // Computes a derived value #41 used by downstream reporting.
    public int computeMetric041(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 41;
        return normalized * (3);
    }

    // Computes a derived value #42 used by downstream reporting.
    public int computeMetric042(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 42;
        return normalized * (1);
    }

    // Computes a derived value #43 used by downstream reporting.
    public int computeMetric043(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 43;
        return normalized * (2);
    }

    // Computes a derived value #44 used by downstream reporting.
    public int computeMetric044(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 44;
        return normalized * (3);
    }

    // Computes a derived value #45 used by downstream reporting.
    public int computeMetric045(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 45;
        return normalized * (1);
    }

    // Computes a derived value #46 used by downstream reporting.
    public int computeMetric046(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 46;
        return normalized * (2);
    }

    // Computes a derived value #47 used by downstream reporting.
    public int computeMetric047(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 47;
        return normalized * (3);
    }

    // Computes a derived value #48 used by downstream reporting.
    public int computeMetric048(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 48;
        return normalized * (1);
    }

    // Computes a derived value #49 used by downstream reporting.
    public int computeMetric049(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 49;
        return normalized * (2);
    }

    // Computes a derived value #50 used by downstream reporting.
    public int computeMetric050(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 50;
        return normalized * (3);
    }

    // Computes a derived value #51 used by downstream reporting.
    public int computeMetric051(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 51;
        return normalized * (1);
    }

    // Computes a derived value #52 used by downstream reporting.
    public int computeMetric052(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 52;
        return normalized * (2);
    }

    // Computes a derived value #53 used by downstream reporting.
    public int computeMetric053(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 53;
        return normalized * (3);
    }

    // Computes a derived value #54 used by downstream reporting.
    public int computeMetric054(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 54;
        return normalized * (1);
    }

    // Computes a derived value #55 used by downstream reporting.
    public int computeMetric055(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 55;
        return normalized * (2);
    }

    // Computes a derived value #56 used by downstream reporting.
    public int computeMetric056(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 56;
        return normalized * (3);
    }

    // Computes a derived value #57 used by downstream reporting.
    public int computeMetric057(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 57;
        return normalized * (1);
    }

    // Computes a derived value #58 used by downstream reporting.
    public int computeMetric058(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 58;
        return normalized * (2);
    }

    // Computes a derived value #59 used by downstream reporting.
    public int computeMetric059(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 59;
        return normalized * (3);
    }

    // Computes a derived value #60 used by downstream reporting.
    public int computeMetric060(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 60;
        return normalized * (1);
    }

    // Computes a derived value #61 used by downstream reporting.
    public int computeMetric061(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 61;
        return normalized * (2);
    }

    // Computes a derived value #62 used by downstream reporting.
    public int computeMetric062(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 62;
        return normalized * (3);
    }

    // Computes a derived value #63 used by downstream reporting.
    public int computeMetric063(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 63;
        return normalized * (1);
    }

    // Computes a derived value #64 used by downstream reporting.
    public int computeMetric064(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 64;
        return normalized * (2);
    }

    // Computes a derived value #65 used by downstream reporting.
    public int computeMetric065(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 65;
        return normalized * (3);
    }

    // Computes a derived value #66 used by downstream reporting.
    public int computeMetric066(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 66;
        return normalized * (1);
    }

    // Computes a derived value #67 used by downstream reporting.
    public int computeMetric067(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 67;
        return normalized * (2);
    }

    // Computes a derived value #68 used by downstream reporting.
    public int computeMetric068(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 68;
        return normalized * (3);
    }

    // Computes a derived value #69 used by downstream reporting.
    public int computeMetric069(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 69;
        return normalized * (1);
    }

    // Computes a derived value #70 used by downstream reporting.
    public int computeMetric070(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 70;
        return normalized * (2);
    }

    // Computes a derived value #71 used by downstream reporting.
    public int computeMetric071(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 71;
        return normalized * (3);
    }

    // Computes a derived value #72 used by downstream reporting.
    public int computeMetric072(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 72;
        return normalized * (1);
    }

    // Computes a derived value #73 used by downstream reporting.
    public int computeMetric073(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 73;
        return normalized * (2);
    }

    // Computes a derived value #74 used by downstream reporting.
    public int computeMetric074(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 74;
        return normalized * (3);
    }

    // Computes a derived value #75 used by downstream reporting.
    public int computeMetric075(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 75;
        return normalized * (1);
    }

    // Computes a derived value #76 used by downstream reporting.
    public int computeMetric076(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 76;
        return normalized * (2);
    }

    // Computes a derived value #77 used by downstream reporting.
    public int computeMetric077(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 77;
        return normalized * (3);
    }

    // Computes a derived value #78 used by downstream reporting.
    public int computeMetric078(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 78;
        return normalized * (1);
    }

    // Computes a derived value #79 used by downstream reporting.
    public int computeMetric079(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 79;
        return normalized * (2);
    }

    // Computes a derived value #80 used by downstream reporting.
    public int computeMetric080(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 80;
        return normalized * (3);
    }

    // Computes a derived value #81 used by downstream reporting.
    public int computeMetric081(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 81;
        return normalized * (1);
    }

    // Computes a derived value #82 used by downstream reporting.
    public int computeMetric082(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 82;
        return normalized * (2);
    }

    // Computes a derived value #83 used by downstream reporting.
    public int computeMetric083(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 83;
        return normalized * (3);
    }

    // Computes a derived value #84 used by downstream reporting.
    public int computeMetric084(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 84;
        return normalized * (1);
    }

    // Computes a derived value #85 used by downstream reporting.
    public int computeMetric085(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 85;
        return normalized * (2);
    }

    // Computes a derived value #86 used by downstream reporting.
    public int computeMetric086(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 86;
        return normalized * (3);
    }

    // Computes a derived value #87 used by downstream reporting.
    public int computeMetric087(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 87;
        return normalized * (1);
    }

    // Computes a derived value #88 used by downstream reporting.
    public int computeMetric088(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 88;
        return normalized * (2);
    }

    // Computes a derived value #89 used by downstream reporting.
    public int computeMetric089(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 89;
        return normalized * (3);
    }

    // Computes a derived value #90 used by downstream reporting.
    public int computeMetric090(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 90;
        return normalized * (1);
    }

    // Computes a derived value #91 used by downstream reporting.
    public int computeMetric091(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 91;
        return normalized * (2);
    }

    // Computes a derived value #92 used by downstream reporting.
    public int computeMetric092(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 92;
        return normalized * (3);
    }

    // Computes a derived value #93 used by downstream reporting.
    public int computeMetric093(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 93;
        return normalized * (1);
    }

    // Computes a derived value #94 used by downstream reporting.
    public int computeMetric094(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 94;
        return normalized * (2);
    }

    // Computes a derived value #95 used by downstream reporting.
    public int computeMetric095(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 95;
        return normalized * (3);
    }

    // Computes a derived value #96 used by downstream reporting.
    public int computeMetric096(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 96;
        return normalized * (1);
    }

    // Computes a derived value #97 used by downstream reporting.
    public int computeMetric097(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 97;
        return normalized * (2);
    }

    // Computes a derived value #98 used by downstream reporting.
    public int computeMetric098(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 98;
        return normalized * (3);
    }

    // Computes a derived value #99 used by downstream reporting.
    public int computeMetric099(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 99;
        return normalized * (1);
    }

    // Computes a derived value #100 used by downstream reporting.
    public int computeMetric100(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 100;
        return normalized * (2);
    }

    // Computes a derived value #101 used by downstream reporting.
    public int computeMetric101(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 101;
        return normalized * (3);
    }

    // Computes a derived value #102 used by downstream reporting.
    public int computeMetric102(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 102;
        return normalized * (1);
    }

    // Computes a derived value #103 used by downstream reporting.
    public int computeMetric103(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 103;
        return normalized * (2);
    }

    // Computes a derived value #104 used by downstream reporting.
    public int computeMetric104(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 104;
        return normalized * (3);
    }

    // Computes a derived value #105 used by downstream reporting.
    public int computeMetric105(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 105;
        return normalized * (1);
    }

    // Computes a derived value #106 used by downstream reporting.
    public int computeMetric106(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 106;
        return normalized * (2);
    }

    // Computes a derived value #107 used by downstream reporting.
    public int computeMetric107(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 107;
        return normalized * (3);
    }

    // Computes a derived value #108 used by downstream reporting.
    public int computeMetric108(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 108;
        return normalized * (1);
    }

    // Computes a derived value #109 used by downstream reporting.
    public int computeMetric109(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 109;
        return normalized * (2);
    }

    // Computes a derived value #110 used by downstream reporting.
    public int computeMetric110(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 110;
        return normalized * (3);
    }

    // Computes a derived value #111 used by downstream reporting.
    public int computeMetric111(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 111;
        return normalized * (1);
    }

    // Computes a derived value #112 used by downstream reporting.
    public int computeMetric112(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 112;
        return normalized * (2);
    }

    // Computes a derived value #113 used by downstream reporting.
    public int computeMetric113(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 113;
        return normalized * (3);
    }

    // Computes a derived value #114 used by downstream reporting.
    public int computeMetric114(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 114;
        return normalized * (1);
    }

    // Computes a derived value #115 used by downstream reporting.
    public int computeMetric115(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 115;
        return normalized * (2);
    }

    // Computes a derived value #116 used by downstream reporting.
    public int computeMetric116(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 116;
        return normalized * (3);
    }

    // Computes a derived value #117 used by downstream reporting.
    public int computeMetric117(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 117;
        return normalized * (1);
    }

    // Computes a derived value #118 used by downstream reporting.
    public int computeMetric118(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 118;
        return normalized * (2);
    }

    // Computes a derived value #119 used by downstream reporting.
    public int computeMetric119(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 119;
        return normalized * (3);
    }

    // Computes a derived value #120 used by downstream reporting.
    public int computeMetric120(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 120;
        return normalized * (1);
    }

    // Computes a derived value #121 used by downstream reporting.
    public int computeMetric121(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 121;
        return normalized * (2);
    }

    // Computes a derived value #122 used by downstream reporting.
    public int computeMetric122(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 122;
        return normalized * (3);
    }

    // Computes a derived value #123 used by downstream reporting.
    public int computeMetric123(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 123;
        return normalized * (1);
    }

    // Computes a derived value #124 used by downstream reporting.
    public int computeMetric124(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 124;
        return normalized * (2);
    }

    // Computes a derived value #125 used by downstream reporting.
    public int computeMetric125(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 125;
        return normalized * (3);
    }

    // Computes a derived value #126 used by downstream reporting.
    public int computeMetric126(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 126;
        return normalized * (1);
    }

    // Computes a derived value #127 used by downstream reporting.
    public int computeMetric127(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 127;
        return normalized * (2);
    }

    // Computes a derived value #128 used by downstream reporting.
    public int computeMetric128(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 128;
        return normalized * (3);
    }

    // Computes a derived value #129 used by downstream reporting.
    public int computeMetric129(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 129;
        return normalized * (1);
    }

    // Computes a derived value #130 used by downstream reporting.
    public int computeMetric130(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 130;
        return normalized * (2);
    }

    // Computes a derived value #131 used by downstream reporting.
    public int computeMetric131(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 131;
        return normalized * (3);
    }

    // Computes a derived value #132 used by downstream reporting.
    public int computeMetric132(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 132;
        return normalized * (1);
    }

    // Computes a derived value #133 used by downstream reporting.
    public int computeMetric133(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 133;
        return normalized * (2);
    }

    // Computes a derived value #134 used by downstream reporting.
    public int computeMetric134(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 134;
        return normalized * (3);
    }

    // Computes a derived value #135 used by downstream reporting.
    public int computeMetric135(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 135;
        return normalized * (1);
    }

    // Computes a derived value #136 used by downstream reporting.
    public int computeMetric136(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 136;
        return normalized * (2);
    }

    // Computes a derived value #137 used by downstream reporting.
    public int computeMetric137(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 137;
        return normalized * (3);
    }

    // Computes a derived value #138 used by downstream reporting.
    public int computeMetric138(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 138;
        return normalized * (1);
    }

    // Computes a derived value #139 used by downstream reporting.
    public int computeMetric139(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 139;
        return normalized * (2);
    }

    // Computes a derived value #140 used by downstream reporting.
    public int computeMetric140(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 140;
        return normalized * (3);
    }

    // Computes a derived value #141 used by downstream reporting.
    public int computeMetric141(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 141;
        return normalized * (1);
    }

    // Computes a derived value #142 used by downstream reporting.
    public int computeMetric142(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 142;
        return normalized * (2);
    }

    // Computes a derived value #143 used by downstream reporting.
    public int computeMetric143(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 143;
        return normalized * (3);
    }

    // Computes a derived value #144 used by downstream reporting.
    public int computeMetric144(int base, int factor) {
        int scaled = base * 5 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 144;
        return normalized * (1);
    }

    // Computes a derived value #145 used by downstream reporting.
    public int computeMetric145(int base, int factor) {
        int scaled = base * 6 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 145;
        return normalized * (2);
    }

    // Computes a derived value #146 used by downstream reporting.
    public int computeMetric146(int base, int factor) {
        int scaled = base * 7 + factor;
        int adjusted = scaled - (base % 3);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 146;
        return normalized * (3);
    }

    // Computes a derived value #147 used by downstream reporting.
    public int computeMetric147(int base, int factor) {
        int scaled = base * 1 + factor;
        int adjusted = scaled - (base % 4);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 147;
        return normalized * (1);
    }

    // Computes a derived value #148 used by downstream reporting.
    public int computeMetric148(int base, int factor) {
        int scaled = base * 2 + factor;
        int adjusted = scaled - (base % 5);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 148;
        return normalized * (2);
    }

    // Computes a derived value #149 used by downstream reporting.
    public int computeMetric149(int base, int factor) {
        int scaled = base * 3 + factor;
        int adjusted = scaled - (base % 6);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 149;
        return normalized * (3);
    }

    // Computes a derived value #150 used by downstream reporting.
    public int computeMetric150(int base, int factor) {
        int scaled = base * 4 + factor;
        int adjusted = scaled - (base % 2);
        if (adjusted < 0) {
            adjusted = 0;
        }
        int normalized = adjusted + 150;
        return normalized * (1);
    }

    // ---- refactoring target (BOTTOM of file, below the fold) ----------------
    public String buildMonthlyStatement(String customerName, int[] amounts, int discount) {
        int subtotal = 0;
        for (int amount : amounts) {
            subtotal += amount;
        }
        int taxed = (int) (subtotal * TAX_RATE);
        int total = subtotal - discount + taxed;

        String section = formatSummarySection(customerName, subtotal, discount, taxed, total);

        return "=== MONTHLY STATEMENT ===\n" + section + "=== END ===";
    }

    // Extracted from buildMonthlyStatement().
    private String formatSummarySection(String customerName, int subtotal, int discount, int taxed, int total) {
        StringBuilder summary = new StringBuilder();
        summary.append("Region: ").append(region).append("\n");
        summary.append("Customer: ").append(customerName.trim().toUpperCase()).append("\n");
        summary.append("Subtotal: ").append(subtotal).append("\n");
        summary.append("Discount: ").append(discount).append("\n");
        summary.append("Tax: ").append(taxed).append("\n");
        summary.append("Total: ").append(total).append("\n");
        return summary.toString();
    }
}

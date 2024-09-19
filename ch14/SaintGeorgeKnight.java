package gr.aueb.cf.ch14;

public class SaintGeorgeKnight {

    private static final SaintGeorgeKnight INSTANCE = new SaintGeorgeKnight();

    private SaintGeorgeKnight() {
    }

    public static SaintGeorgeKnight embarkOnMission() {
        return INSTANCE;
    }
}

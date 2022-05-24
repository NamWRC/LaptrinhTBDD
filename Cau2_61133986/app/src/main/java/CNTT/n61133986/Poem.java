package CNTT.n61133986;

public class Poem {
    String MaTho;
    String TenTho;
    String TenTG;

    public Poem(String maTho, String tenTho) {
        MaTho = maTho;
        TenTho = tenTho;
    }

    public String getMaTho() {
        return MaTho;
    }

    public void setMaTho(String maTho) {
        MaTho = maTho;
    }

    public String getTenTho() {
        return TenTho;
    }

    public void setTenTho(String tenTho) {
        TenTho = tenTho;
    }
}

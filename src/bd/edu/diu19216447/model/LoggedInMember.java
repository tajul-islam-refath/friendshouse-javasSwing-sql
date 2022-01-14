package bd.edu.diu19216447.model;

public class LoggedInMember {

    private Member member;
    private static LoggedInMember instance;

    public LoggedInMember() {
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public static LoggedInMember getInstance() {
        if (instance == null) {
            instance = new LoggedInMember();
        }
        return instance;
    }

}

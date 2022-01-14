package bd.edu.diu19216447.controller;

import bd.edu.diu19216447.model.Member;
import java.util.ArrayList;

public class MemberController {

    public boolean saveMember(Member m) {
        return m.save();
    }

    public ArrayList<Member> getMembers() {
        return Member.allMembers();
    }

    public boolean updateMember(Member m) {
        return m.update();
    }

    public Member logIn(String email, String password) {
        return Member.logIn(email, password);
    }
}

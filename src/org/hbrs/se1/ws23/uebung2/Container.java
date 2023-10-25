package org.hbrs.se1.ws23.uebung2;

import java.util.ArrayList;

public class Container {
    public ArrayList<Member> memberList =new ArrayList();


    public void addMember(Member member) throws ContainerException {
        if(memberList.contains(member)){
            throw new ContainerException("Das Member-Objekt mit der ID " + member.getID() + " ist bereits vorhanden!");
        } else
        {
            memberList.add(member);
        }
    }
    public String deleteMember(Integer ID){

        for(Member o: memberList){
            if(o.getID()==ID){
                memberList.remove(o);
                return "Member deleted";
            }
        }
        return ("Kein Member mit"+ID+"bekannt");
    }
    public void dump(){
        for(Member o: memberList){
            System.out.println(o.toString());
        }
    }
    public int size(){
        return memberList.size();
    }
}

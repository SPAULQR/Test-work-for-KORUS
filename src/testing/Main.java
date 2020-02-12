package testing;


import school.data.DataCreation;
import school.service.Finder;
import school.data.MembersGroup;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        DataCreation data = new DataCreation();
        Finder finder = new Finder();
        List<MembersGroup> membersGroups = data.createMembersGroups();
        int targetAge = 50;


        Set<String> oldMembersByOld = finder.findOldMembers(membersGroups, targetAge);
        System.out.println("Размер множества, найденного старым методом: " + oldMembersByOld.size());

        Set<String> oldMembersByNew = finder.findOldMembersNew(membersGroups, targetAge);
        System.out.println("Размер множества, найденного новым методом: " + oldMembersByNew.size());

        List<String> oldMembersByNewList = finder.findOldMembersNewList(membersGroups, targetAge);
        System.out.println("Размер списка, найденного новым методом: " + oldMembersByNewList.size());
        //Здесь будет больше имён, потому что список позволяет хранить одинаковые данные
    }
}
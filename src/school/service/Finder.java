package school.service;

import school.data.Member;
import school.data.MembersGroup;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Finder {

    /**
     * Поиск групп людей старше определенного возраста.
     *
     *  @param groups    группы
     *  @param targetAge возраст для поиска
     *  @return список имен групп из списка групп старше возраста targetAge
     */

    public Set<String> findOldMembers(List<MembersGroup> groups, int targetAge) {
        Set<String> groupsNames = new HashSet<>();
        for (MembersGroup membersGroup : groups) {
            for (Member member : membersGroup.getMembers()) {
                if (member.getAge() > targetAge) {
                    String name = member.getName();
                    groupsNames.add(name);
                }
            }
        }
        return groupsNames;
    } //старый метод

    public Set<String> findOldMembersNew (List<MembersGroup> groups, int targetAge){
        return groups.stream()
                .map(MembersGroup::getMembers)
                .flatMap(Collection::stream)
                .filter(member -> member.getAge()>targetAge)
                .map(Member::getName).collect(Collectors.toSet());
    } //рефакторинг findOldMembers, используя stream api

    /*
    Также можно хранить список имён не в Set, а в List, добавив к строке возраст,
    чтобы как-то различать участников с одинаковыми именами.
    Тогда участники, подходящие условиям, не терялись бы в структуре данных, как в Set.

    Пример такого метода ниже:
     */

    public List<String> findOldMembersNewList (List<MembersGroup> groups, int targetAge){
        return groups.stream()
                .map(MembersGroup::getMembers)
                .flatMap(Collection::stream)
                .filter(member -> member.getAge()>targetAge)
                .map(Member::getName).collect(Collectors.toList());
    }
}

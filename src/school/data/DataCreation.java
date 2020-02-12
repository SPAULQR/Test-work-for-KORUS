package school.data;

import school.data.Member;
import school.data.MembersGroup;

import java.util.ArrayList;
import java.util.List;

//класс для создания экземпляра membersGroups
public class DataCreation {
    private final String[] names = new String[]{
            "Авдей", "Авксентий", "Агафон", "Александр", "Алексей", "Альберт", "Альвиан", "Анатолий", "Андрей",
            "Антон", "Антонин", "Анфим", "Аристарх", "Аркадий", "Арсений", "Артём", "Артур", "Архипп", "Афанасий",
            "Агафья", "Агриппина", "Акулина", "Алевтина", "Александра", "Алина", "Алла", "Анастасия", "Ангелина",
            "Анжела", "Анжелика", "Анна", "Антонина", "Анфиса", "Валентина", "Валерия", "Варвара", "Василиса",
            "Вера", "Вероника", "Виктория", "Галина", "Глафира", "Дана", "Дарья", "Евгения", "Евдокия", "Евлампия",
            "Евпраксия", "Евфросиния", "Екатерина", "Елена", "Елизавета", "Епистима", "Ермиония", "Жанна", "Зинаида",
            "Злата", "Зоя", "Инга", "Инесса", "Инна", "Иоанна", "Ираида", "Ирина", "Ия", "Карина", "Каролина",
            "Кира", "Клавдия", "Ксения", "Лада", "Лариса", "Лидия", "Лилия", "Любовь", "Людмила", "Маргарита",
            "Марина", "Мария", "Марфа", "Матрёна", "Милица", "Мирослава", "Надежда", "Наталья", "Нина", "Нонна",
            "Оксана", "Октябрина", "Ольга", "Пелагея", "Пинна", "Полина", "Прасковья", "Рада", "Раиса", "Римма",
            "Светлана", "Серафима", "Снежана", "София", "Таисия", "Тамара", "Татьяна", "Ульяна", "Фаина", "Феврония",
            "Фёкла", "Феодора", "Целестина", "Юлия", "Яна", "Ярослава", "Богдан", "Борис", "Вадим", "Валентин",
            "Валерий", "Валерьян", "Варлам", "Варсонофий", "Варфоломей", "Василий", "Венедикт", "Вениамин",
            "Викентий", "Виктор", "Виссарион", "Виталий", "Владимир", "Владислав", "Владлен", "Влас", "Всеволод",
            "Вячеслав", "Гавриил", "Галактион", "Геласий", "Геннадий", "Георгий", "Герасим", "Герман", "Глеб",
            "Гордей", "Григорий", "Даниил", "Демид", "Демьян", "Денис", "Дмитрий", "Добрыня", "Донат", "Дорофей",
            "Евгений", "Евграф", "Евдоким", "Евсей", "Евстафий", "Егор", "Емельян", "Еремей", "Ермолай", "Ефим",
            "Ждан", "Зиновий", "Иакинф", "Иван", "Игнатий", "Игорь", "Илья", "Иннокентий", "Ираклий", "Ириней",
            "Исидор", "Иулиан", "Ким", "Кирилл", "Климент", "Кондрат", "Константин", "Корнилий", "Кузьма", "Куприян",
            "Лаврентий", "Лев", "Леонид", "Леонтий", "Лука", "Лукий", "Лукьян", "Магистриан", "Макар", "Максим",
            "Марк", "Мартын", "Матвей", "Мелентий", "Мина", "Мирон", "Мирослав", "Митрофан", "Михаил", "Мстислав",
            "Назар", "Нестор", "Никанор", "Никита", "Никифор", "Николай", "Никон", "Олег", "Онисим", "Онуфрий",
            "Павел", "Паисий", "Пантелеймон", "Парфений", "Пафнутий", "Пахомий", "Пётр", "Платон", "Порфирий",
            "Потап", "Пров", "Прокопий", "Протасий", "Прохор", "Разумник", "Родион", "Роман", "Ростислав", "Руслан",
            "Савва", "Савелий", "Самуил", "Святополк", "Святослав", "Севастьян", "Семён", "Сергей", "Сильвестр",
            "Созон", "Спиридон", "Станислав", "Степан", "Тарас", "Тимофей", "Тимур", "Тихон", "Трифон", "Трофим",
            "Фаддей", "Фёдор", "Федосей", "Федот", "Феликс", "Феоктист", "Филат", "Филипп", "Фома", "Харитон",
            "Христофор", "Эдуард", "Эраст", "Юлиан", "Юрий", "Юстин", "Яков", "Якун", "Ярослав",
    }; //длина 270, список имён


    //Этот метод генерирует список MembersGroups,
    //используя для каждого Member случайные имена из массива names и случайный возраст от 0 до 75.
    public List<MembersGroup> createMembersGroups() {
        List<MembersGroup> membersGroups = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            List<Member> members = new ArrayList<>();
            for (int j = 0; j < 25; j++) {
                members.add(new Member(names[(int) (Math.random() * 270)], (int) (Math.random() * 76)));
            }
            membersGroups.add(new MembersGroup(String.valueOf(i), members));
        }
        return membersGroups;
    }
}
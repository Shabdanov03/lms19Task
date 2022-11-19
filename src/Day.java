public enum Day {
    MONDAY(" Дуйшөмбү куну жава окуйм "),
    TUESDAY(" Шейшемби күнү англис тили сабагын окуйм "),
    WEDNESDAY(" Шаршемби күнү жава сабагын окуйм "),
    THURSDAY(" Бейшемби күнү практикалык сабак окуйм "),
    FRIDAY(" Жуму күнү совт скилз сабагын окуйм "),
    SATURDAY(" Ишемби күнү сабак жок жөн гана практика кылам "),
    SUNDAY(" Жекшемби күнү экзаменге даярдык");

    private String day;

    Day(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return " Day = " + day;
    }
}

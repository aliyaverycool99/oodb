package icmit.oodb.Lab3.domain;


//Класс кадровиков
//В этом классе хранятся личные данные человека, его должность, дата его устройства на работу, его премия, список его дополнительных работ
//Также тут высчитывается его ЗП
//
import javax.xml.bind.annotation.XmlElement;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Personnel{
    private long ID;
    private Person person;
    private Extra_salary salary;
    private Calendar date_employment;
    private Position position;
    private int bonus;
//    private int itog;

    public Personnel(){

    }


    public Personnel(long ID, Person person, Position position, Calendar date_employment, Extra_salary salary, int bonus) {
        this.ID = ID;
        this.position = position;
        this.date_employment = date_employment;
        this.bonus = bonus;
        this.person = person;
        this.salary = salary;
//        this.itog = position.getSize()+salary.getSize()+bonus;
    }



    @Override
    public String toString() {
        String strdate = null;
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        if (date_employment != null) {
            strdate = sdf.format(date_employment.getTime());
        }
        return "Personnel{" +
                person + '\'' +
                position + '\'' +
                ", Date of employment = '" + strdate + '\'' +
                salary + '\'' +
                ", Bonus = '" + bonus + '\'' +
//                ", Itog = '" + itog + '\'' +
                '}';
    }

//    Personnel personnel;
//@XmlElement(name = "name-personnel")
//    public Personnel getPersonnel() {
//        return personnel;
//    }

//    public void setPersonnel(Personnel personnel) {
//        this.personnel = personnel;
//    }


    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Extra_salary getSalary() {
        return salary;
    }

    public void setSalary(Extra_salary salary) {
        this.salary = salary;
    }

    public Calendar getDate_employment() {
        return date_employment;
    }

    public void setDate_employment(Calendar date_employment) {
        this.date_employment = date_employment;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

//    public int getItog() {
//        return itog;
//    }
//
//    public void setItog(int itog) {
//        this.itog = itog;
//    }
}

import interfaces.IInfrastructure;
import models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RealEstateCompanyTest {
    RealEstateCompany company;
    Bridge bridge;
    Office office;
    HallsOfResidence studentResidence;
    Bungalow bungalow;
    @BeforeEach
    public void setUp(){
        company = new RealEstateCompany("Property&CO","James", LocalDate.parse("1980-05-12"));
        bridge = new Bridge("Iron", 777);
        office = new Office(LocalDate.parse("2007-12-03"));
        studentResidence = new HallsOfResidence(LocalDate.parse("2018-01-01"));
        bungalow = new Bungalow(LocalDate.parse("2018-01-01"), "European");
    }
    @Test
    public void canGetName(){
        assertThat(company.getName()).isEqualTo("Property&CO");
    }
    @Test
    public void canSetName(){
        company.setName("BNTA_Association");
        assertThat(company.getName()).isEqualTo("BNTA_Association");
    }
    @Test
    public void canGetOwner(){
        assertThat(company.getOwner()).isEqualTo("James");
    }
    @Test
    public void canSetOwner(){
        company.setOwner("White");
        assertThat(company.getOwner()).isEqualTo("White");
    }
    @Test
    public void canGetDateOfEstablishment(){
        assertThat(company.getDateOfEstablishment()).isEqualTo("1980-05-12");
    }
    @Test
    public void canSetDateOfEstablishment(){
        company.setDateOfEstablishment(LocalDate.parse("2020-01-01"));
        assertThat(company.getDateOfEstablishment()).isEqualTo("2020-01-01");
    }
    @Test
    public void canGetProperties(){
        ArrayList<IInfrastructure> properties = new ArrayList<IInfrastructure>();
        assertThat(company.getProperties().size()).isEqualTo(0);
    }
    @Test
    public void canSetProperties(){
        ArrayList<IInfrastructure> properties = new ArrayList<IInfrastructure>();
        properties.add(bridge);
        properties.add(office);
        properties.add(studentResidence);
        properties.add(bungalow);
        company.setProperties(properties);
        assertThat(company.getProperties().size()).isEqualTo(4);
    }
    @Test
    public void canAddProperty(){
        company.addProperty(bridge);
        company.addProperty(office);
        company.addProperty(studentResidence);
        company.addProperty(bungalow);
        assertThat(company.getProperties().size()).isEqualTo(4);
    }
    @Test
    public void canGetRevenue(){
        assertThat(company.getRevenue()).isEqualTo(0);
    }
    @Test
    public void canGetRevenue2(){
        company.setRevenue(900000000);
        assertThat(company.getRevenue(9000)).isEqualTo(899991000);
    }
    @Test
    public void canSetRevenue(){
        company.setRevenue(900000000);
        assertThat(company.getRevenue()).isEqualTo(900000000);
    }
}

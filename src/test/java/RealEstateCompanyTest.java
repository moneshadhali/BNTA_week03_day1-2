import models.RealEstateCompany;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDate;

public class RealEstateCompanyTest {
    RealEstateCompany company;
    @BeforeEach
    public void setUp(){
        company = new RealEstateCompany("Property&CO","James", LocalDate.parse("1980-05-12"));
    }

}

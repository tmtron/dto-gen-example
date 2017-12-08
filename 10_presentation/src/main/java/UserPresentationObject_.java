import com.tmtron.dtogen.example.UserDomainObject;
import com.tmtron.dtogen.processor.DtoConfig;
import com.tmtron.dtogen.processor.DtoIgnore;

@DtoConfig
public abstract class UserPresentationObject_ extends UserDomainObject {

    @DtoIgnore
    Object lastName;

}

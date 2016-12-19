package validation.api;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by yf on 2016/12/19.
 */
public interface ValidationService {

    @interface Save{} // 与方法同名接口，首字母大写，用于区分验证场景，如：@NotNull(groups = ValidationService.Save.class)，可选
    void save(ValidationParameter parameter);

    @interface Update{} // 与方法同名接口，首字母大写，用于区分验证场景，如：@NotNull(groups = ValidationService.Update.class)，可选
    void update(ValidationParameter parameter);

    void delete(@Min(1) long id, @NotNull @Size(min = 2, max = 16) @Pattern(regexp = "^[a-zA-Z]+$") String operator);
}

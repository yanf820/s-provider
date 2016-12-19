package validation.impl;

import validation.api.ValidationParameter;
import validation.api.ValidationService;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by yf on 2016/12/19.
 */
public class ValidationServiceImpl implements ValidationService {
    @Override
    public void save(ValidationParameter parameter) {

    }

    @Override
    public void update(ValidationParameter parameter) {

    }

    @Override
    public void delete(@Min(1) long id, @NotNull @Size(min = 2, max = 16) @Pattern(regexp = "^[a-zA-Z]+$") String operator) {

    }
}

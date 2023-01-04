package com.cmbc.common.core.domain.model;

import com.cmbc.common.constant.UserConstants;
import lombok.Data;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;
@Data
public class LoginBody {

    @NotBlank(message = "{user.username.not.blank}")
    @Length(min = UserConstants.USERNAME_MIN_LENGTH, max = UserConstants.USERNAME_MAX_LENGTH, message = "{user.username.length.valid}")
    private String userName;

    /**
     * 用户密码
     */
    @NotBlank(message = "{user.password.not.blank}")
    @Length(min = UserConstants.PASSWORD_MIN_LENGTH, max = UserConstants.PASSWORD_MAX_LENGTH, message = "{user.password.length.valid}")
    private String password;

    private String code;

    private String uuid;

}

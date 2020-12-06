package stu.yang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import stu.yang.domain.BaseResponse;
import stu.yang.entity.TbUser;
import stu.yang.handler.JwtToken;
import stu.yang.util.Hash;

/**
 * 账户体系权限验证
 */
@RestController
@RequestMapping("/auth")
public class AccountController {

    @GetMapping("/token")
    public BaseResponse<String> token(String account, String password) {
        //根据账户密码查询用户
        TbUser userDto = selectAccount(account, password);
        if (userDto == null) {
            throw new IllegalArgumentException("用户名或密码错误");
        }
        try {
            //根据用户信息和密钥得到token
            String token = JwtToken.createToken(userDto.getId());
            return new BaseResponse<>(token);
        } catch (Exception e){
            return new BaseResponse<>(500, "登录异常");
        }
    }

    private TbUser selectAccount(String account, String password) {

        //加密密码为对密码进行一次HmacSHA256，密钥为secret
        password = Hash.encode(JwtToken.SECRET, password);

        if ("admin".equals(account) && "4a83854cf6f0112b4295bddd535a9b3fbe54a3f90e853b59d42e4bed553c55a4".equals(password)) {
            TbUser user = new TbUser();
            user.setId(0);
            user.setAccount(account);
            user.setName("管理员");
            return user;
        }
        return null;
    }
}

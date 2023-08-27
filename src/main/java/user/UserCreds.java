package user;

import io.qameta.allure.Step;

public class UserCreds {
    private String email;
    private String password;

    public UserCreds(String login, String password) {
        this.email = login;
        this.password = password;
    }

    public UserCreds() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String email) {
        this.password = password;
    }

    @Step("Получение учетных данных пользователя")
    public static UserCreds credsFrom(User user) {
        return new UserCreds(user.getEmail(), user.getPassword());
    }
}

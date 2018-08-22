
package com.bridge.recyclebeirut.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;


public class User {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("create_day")
    @Expose
    private String createDay;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("employee_code")
    @Expose
    private Integer employeeCode;
    @SerializedName("title_IDS")
    @Expose
    private Integer titleIDS;
    @SerializedName("body_IDT")
    @Expose
    private Integer bodyIDT;
    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("gender")
    @Expose
    private Integer gender;
    @SerializedName("birth")
    @Expose
    private String birth;
    @SerializedName("company_id")
    @Expose
    private Integer companyId;
    @SerializedName("address_IDT")
    @Expose
    private Integer addressIDT;
    @SerializedName("job_title_IDS")
    @Expose
    private Integer jobTitleIDS;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("personal_email_id")
    @Expose
    private String personalEmailId;
    @SerializedName("skype_id")
    @Expose
    private String skypeId;
    @SerializedName("joining_date")
    @Expose
    private String joiningDate;
    @SerializedName("confirmation_date")
    @Expose
    private String confirmationDate;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("status_id")
    @Expose
    private Integer statusId;
    @SerializedName("status_name")
    @Expose
    private String statusName;
    @SerializedName("active_user")
    @Expose
    private Integer activeUser;
    @SerializedName("employment_status")
    @Expose
    private String employmentStatus;
    @SerializedName("production")
    @Expose
    private String production;
    @SerializedName("role_id")
    @Expose
    private Integer roleId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public User() {
    }

    /**
     * 
     * @param birth
     * @param phone
     * @param personalEmailId
     * @param statusName
     * @param production
     * @param password
     * @param employeeCode
     * @param id
     * @param addressIDT
     * @param joiningDate
     * @param statusId
     * @param activeUser
     * @param token
     * @param name
     * @param gender
     * @param login
     * @param roleId
     * @param bodyIDT
     * @param confirmationDate
     * @param code
     * @param jobTitleIDS
     * @param titleIDS
     * @param skypeId
     * @param email
     * @param address
     * @param companyId
     * @param createDay
     * @param employmentStatus
     */
    public User(Integer id, String token, String createDay, String name, Integer employeeCode, Integer titleIDS, Integer bodyIDT, String login, String password, String email, Integer gender, String birth, Integer companyId, Integer addressIDT, Integer jobTitleIDS, String phone, String address, String personalEmailId, String skypeId, String joiningDate, String confirmationDate, String code, Integer statusId, String statusName, Integer activeUser, String employmentStatus, String production, Integer roleId) {
        super();
        this.id = id;
        this.token = token;
        this.createDay = createDay;
        this.name = name;
        this.employeeCode = employeeCode;
        this.titleIDS = titleIDS;
        this.bodyIDT = bodyIDT;
        this.login = login;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.birth = birth;
        this.companyId = companyId;
        this.addressIDT = addressIDT;
        this.jobTitleIDS = jobTitleIDS;
        this.phone = phone;
        this.address = address;
        this.personalEmailId = personalEmailId;
        this.skypeId = skypeId;
        this.joiningDate = joiningDate;
        this.confirmationDate = confirmationDate;
        this.code = code;
        this.statusId = statusId;
        this.statusName = statusName;
        this.activeUser = activeUser;
        this.employmentStatus = employmentStatus;
        this.production = production;
        this.roleId = roleId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getCreateDay() {
        return createDay;
    }

    public void setCreateDay(String createDay) {
        this.createDay = createDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(Integer employeeCode) {
        this.employeeCode = employeeCode;
    }

    public Integer getTitleIDS() {
        return titleIDS;
    }

    public void setTitleIDS(Integer titleIDS) {
        this.titleIDS = titleIDS;
    }

    public Integer getBodyIDT() {
        return bodyIDT;
    }

    public void setBodyIDT(Integer bodyIDT) {
        this.bodyIDT = bodyIDT;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getAddressIDT() {
        return addressIDT;
    }

    public void setAddressIDT(Integer addressIDT) {
        this.addressIDT = addressIDT;
    }

    public Integer getJobTitleIDS() {
        return jobTitleIDS;
    }

    public void setJobTitleIDS(Integer jobTitleIDS) {
        this.jobTitleIDS = jobTitleIDS;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPersonalEmailId() {
        return personalEmailId;
    }

    public void setPersonalEmailId(String personalEmailId) {
        this.personalEmailId = personalEmailId;
    }

    public String getSkypeId() {
        return skypeId;
    }

    public void setSkypeId(String skypeId) {
        this.skypeId = skypeId;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getConfirmationDate() {
        return confirmationDate;
    }

    public void setConfirmationDate(String confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Integer getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(Integer activeUser) {
        this.activeUser = activeUser;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("token", token).append("createDay", createDay).append("name", name).append("employeeCode", employeeCode).append("titleIDS", titleIDS).append("bodyIDT", bodyIDT).append("login", login).append("password", password).append("email", email).append("gender", gender).append("birth", birth).append("companyId", companyId).append("addressIDT", addressIDT).append("jobTitleIDS", jobTitleIDS).append("phone", phone).append("address", address).append("personalEmailId", personalEmailId).append("skypeId", skypeId).append("joiningDate", joiningDate).append("confirmationDate", confirmationDate).append("code", code).append("statusId", statusId).append("statusName", statusName).append("activeUser", activeUser).append("employmentStatus", employmentStatus).append("production", production).append("roleId", roleId).toString();
    }

}

package cap.model;

public class Profile {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profile.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profile.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profile.first_name
     *
     * @mbggenerated
     */
    private String firstName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profile.last_name
     *
     * @mbggenerated
     */
    private String lastName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profile.gender
     *
     * @mbggenerated
     */
    private Boolean gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column profile.telephone
     *
     * @mbggenerated
     */
    private String telephone;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profile.id
     *
     * @return the value of profile.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profile.id
     *
     * @param id the value for profile.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profile.user_id
     *
     * @return the value of profile.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profile.user_id
     *
     * @param userId the value for profile.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profile.first_name
     *
     * @return the value of profile.first_name
     *
     * @mbggenerated
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profile.first_name
     *
     * @param firstName the value for profile.first_name
     *
     * @mbggenerated
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profile.last_name
     *
     * @return the value of profile.last_name
     *
     * @mbggenerated
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profile.last_name
     *
     * @param lastName the value for profile.last_name
     *
     * @mbggenerated
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profile.gender
     *
     * @return the value of profile.gender
     *
     * @mbggenerated
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profile.gender
     *
     * @param gender the value for profile.gender
     *
     * @mbggenerated
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column profile.telephone
     *
     * @return the value of profile.telephone
     *
     * @mbggenerated
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column profile.telephone
     *
     * @param telephone the value for profile.telephone
     *
     * @mbggenerated
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }
}
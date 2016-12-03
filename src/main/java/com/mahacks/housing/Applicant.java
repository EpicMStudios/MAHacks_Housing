package com.mahacks.housing;


/*
                    _-====-__-======-__-========-_____-============-__
                  _(                                                 _)
               OO(          @author				                  )_
              0  (_                  Kendall Niles Peretz             _)
            o0     (_                                                _)
           o         '=-___-===-_____-========-___________-===-___-='
         .o                                _________
        . ______          ______________  |         |      _____
      _()_||__|| ________ |            |  |_________|   __||___||__
     (         | |      | |            | __Y______00_| |_         _|
    /-OO----OO""="OO--OO"="OO--------OO"="OO-------OO"="OO-------OO"=P
   #####################################################################

 */

public class Applicant {

	//privates
	private String firstName;
	private String middleName;
	private String lastName;

	private boolean sex;
	final public static boolean MALE = true;
	final public static boolean FEMALE = false;

	private int race;
	final public static byte RACE_UNDECLARED = 0;
	final public static byte RACE_WHITE = 1;
	final public static byte RACE_NATIVE_AMERICAN = 2;
	final public static byte RACE_ASIAN = 4;
	final public static byte RACE_BLACK = 8;
	final public static byte RACE_PACIFIC_ISLANDER = 16;
	private boolean isHispanic;

	private byte housingType;
	final public static byte ELDERLY_HOUSING = 1;
	final public static byte HANDICAP_HOUSING = 2;
	final public static byte ELDERLY_HANDICAP = 3;
	final public static byte FAMILY = 4;
	final public static byte MRVP = 5;
	final public static byte AHVP = 6;

	private String disability;
	private String veteranStatus;
	private int income;
	private String address;
	private String mailingAddress;
	private String workAddress;
	private String phone;
	private String workPhone;
	private String email;
	private int timeOnWaitlist;
	private int id;

	private boolean emergencyHousing;

	private int preferance;
	final public int HEALTH_BOARD_CONDEMNATION = 1;
	final public int DISABLED = 2;
	final public int DISPLACED_HATE_CRIMES = 4;
	final public int DISPLACED_LANDLORD_NON_RENEWAL = 8;
	final public int DISPLACED_NATURAL_DISASTER = 16;
	final public int DISPLACED_PUBLIC_ACTION = 32;
	final public int DISPLACED_DOMESTIC_VIOLENCE = 64;
	final public int ELDERLY = 128;
	final public int NEAR_ELDERLY = 256;
	final public int EXTREME_LOW_INCOME = 512;
	final public int DISABILITY = 1024;
	final public int HOMELESS = 2048;
	final public int RENT_BURDENED_FIFTY = 4096;
	final public int RENT_BURDENED_FORTY = 8192;
	final public int ONE_PERSON_FAMILY = 16384;
	final public int SUBSTANDARD_HOUSING = 32768;
	final public int SECTION8_PROJECT_CLIENT = 65536;
	final public int SECTION8_PROJECT_TENANT = 131072;
	final public int VETERAN = 262144;
	final public int WORKING = 524288;
	final public int METCO_PARTICIPANT = 1048576;
	final public int PERSIAN_GULF_VETERAN = 2097152;

	//secure this
	private String ssn;


	/*
	 * default ctor
	 * creates a blank application to be updated later based on user input
	 */
	public Applicant(){
		id = 0;
		firstName = "";
		middleName = "";
		sex = false;
		lastName = "";
		address = "";
		mailingAddress = "";
		workAddress = "";
		race = 0;
		isHispanic = false;
		disability = "";
		veteranStatus = "";
		income = 0;
		phone = "";
		workPhone = "";
		email = "";
		emergencyHousing = false;
		preferance = 0; 
		ssn = "";
		timeOnWaitlist = 0;
	}
	
	public Applicant(int id, String firstName, String middleName, String lastName, boolean sex,
			String address, String mailingAddress, String workAddress, int race, boolean isHispanic,
			String disability,String veteranStatus, int income, String phone, String workPhone,
			String email, byte housingType, boolean emergencyHousing, int preferance, String ssn, int timeOnWaitlist){
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.sex = sex;
		this.address = address;
		this.mailingAddress = mailingAddress;
		this.workAddress = workAddress;
		this.race = race;
		this.isHispanic = isHispanic;
		this.disability = disability;
		this.veteranStatus = veteranStatus;
		this.income = income;
		this.phone = phone;
		this.workPhone = workPhone;
		this.email = email;
		this.housingType = housingType;
		this.emergencyHousing = emergencyHousing;
		this.preferance = preferance; 
		this.ssn = "";
		this.timeOnWaitlist = 0;
	}

	public static Applicant copy(Applicant app){
		Applicant app2 = new Applicant();
		app2.setFirstName(app.getFirstName());
		app2.setMiddleName(app.getMiddleName());
		app2.setLastName(app.getLastName());
		app2.setRace(app.getRace());
		app2.setHispanic(app.isHispanic());
		app2.setVeteranStatus(app.getVeteranStatus());
		app2.setDisability(app.getDisability());
		app2.setHousingType(app.getHousingType());
		app2.setAddress(app.getAddress());
		app2.setMailingAddress(app.getMailingAddress());
		app2.setWorkAddress(app.getWorkAddress());
		app2.setIncome(app.getIncome());
		app2.setPhone(app.getPhone());
		app2.setWorkPhone(app.getWorkPhone());
		app2.setEmail(app.getEmail());
		app2.setEmergencyHousing(app.isEmergencyHousing());
		app2.setSsn(app.getSsn());
		return app2;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean getSex(){
		return sex;
	}

	public void setSex(boolean sex){
		this.sex = sex;
	}

	public int getRace(){
		return race;
	}

	public void setRace(int race){
		this.race = race;
	}

	public void addRace(int race){
		this.race += race; 
	}

	public boolean isHispanic() {
		return isHispanic;
	}

	public void setHispanic(boolean isHispanic) {
		this.isHispanic = isHispanic;
	}

	public byte getHousingType() {
		return housingType;
	}

	public void setHousingType(byte housingType) {
		this.housingType = housingType;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWorkPhone() {
		return workPhone;
	}

	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEmergencyHousing() {
		return emergencyHousing;
	}

	public void setEmergencyHousing(boolean emergencyHousing) {
		this.emergencyHousing = emergencyHousing;
	}

	private String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}

	public String getDisability() {
		return disability;
	}

	public void setDisability(String disability) {
		this.disability = disability;
	}

	private String getVeteranStatus() {
		return veteranStatus;
	}

	public void setVeteranStatus(String veteranStatus) {
		this.veteranStatus = veteranStatus;
	}

	public int getPreferance() {
		return preferance;
	}

	public void setPreferance(int preferance) {
		this.preferance = preferance;
	}

	public int getTimeOnWaitlist() {
		return timeOnWaitlist;
	}

	public void setTimeOnWaitlist(int timeOnWaitlist) {
		this.timeOnWaitlist = timeOnWaitlist;
	}

	public int getPositionOnWaitlist() {
		return id;
	}

	public void setPositionOnWaitlist(int positionOnWaitlist) {
		this.id = positionOnWaitlist;
	}

}


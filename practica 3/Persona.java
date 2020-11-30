class Persona{
    String name,lastNameP,lastNameM,birthdate,gender,state,curp,rfc;

    public Persona(String name,String lastNameP, String lastNameM,String birthdate,String gender, String state, String curp, String rfc){
        this.name=name;
        this.lastNameP=lastNameP;
        this.lastNameM=lastNameM;
        this.birthdate=birthdate;
        this.gender=gender;
        this.state=state;
        this.curp=curp;
        this.rfc=rfc;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setLastNameP(String lastNameP){
        this.lastNameP=lastNameP;
    }

    public void setLastNameM(String lastNameM){
        this.lastNameM=lastNameM;
    }

    public void setBirthdate(String birthdate){
        this.birthdate=birthdate;
    }

    public void setGender(String gender){
        this.gender=gender;
    }

    public void setState(String state){
        this.state=state;
    }

    public void setCURP(String curp){
        this.curp=curp;
    }

    public void setRFC(String rfc){
        this.rfc=rfc;
    }

    public String getName(){
        return name;
    }

    public String getLastNameP(){
        return lastNameP;
    }

    public String getLastNameM(){
        return lastNameM;
    }

    public String getBirthdate(){
        return birthdate;
    }

    public String getGender(){
        return gender;
    }

    public String getState(){
        return state;
    }

    public String getCURP(){
        return curp;
    }

    public String getRFC(){
        return rfc;
    }
}
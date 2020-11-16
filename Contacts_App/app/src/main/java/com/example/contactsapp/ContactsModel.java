package android.example.contactsapp;

public class ContactsModel {

    String name,email,ph;
    int image = 0;

    public  ContactsModel(String mName,String mEmail,String mPh,int mImage){
        this.name = mName;
        this.email = mEmail;
        this.ph = mPh;
        this.image = mImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhno() {
        return ph;
    }

    public void setPhno(String phno) {
        this.ph = phno;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image){
        this.image = image;
    }
    public boolean hasImage() {
        return image != 0;
    }

}
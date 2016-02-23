package com.ycz.yuechaomarket.plugins;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by zhangzeyan on 16/1/15.
 */
public class TestBean implements Parcelable {

    private String attr1;
    private String attr2;
    private String attr3;
    private String attr4;

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public String getAttr3() {
        return attr3;
    }

    public void setAttr3(String attr3) {
        this.attr3 = attr3;
    }

    public String getAttr4() {
        return attr4;
    }

    public void setAttr4(String attr4) {
        this.attr4 = attr4;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.attr1);
        dest.writeString(this.attr2);
        dest.writeString(this.attr3);
        dest.writeString(this.attr4);
    }

    public TestBean() {
    }

    protected TestBean(Parcel in) {
        this.attr1 = in.readString();
        this.attr2 = in.readString();
        this.attr3 = in.readString();
        this.attr4 = in.readString();
    }

    public static final Parcelable.Creator<TestBean> CREATOR = new Parcelable.Creator<TestBean>() {
        public TestBean createFromParcel(Parcel source) {
            return new TestBean(source);
        }

        public TestBean[] newArray(int size) {
            return new TestBean[size];
        }
    };
}

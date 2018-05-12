package me.androidmne.myapplication.models;

import android.os.Parcel;
import android.os.Parcelable;

public class TaskModel implements Parcelable {
    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeString(this.description);
    }

    public TaskModel() {
    }

    protected TaskModel(Parcel in) {
        this.title = in.readString();
        this.description = in.readString();
    }

    public static final Parcelable.Creator<TaskModel> CREATOR = new Parcelable.Creator<TaskModel>() {
        @Override
        public TaskModel createFromParcel(Parcel source) {
            return new TaskModel(source);
        }

        @Override
        public TaskModel[] newArray(int size) {
            return new TaskModel[size];
        }
    };
}

package com.example.demo.systemProfile.implemetations;
import com.example.demo.systemProfile.SystemProfile;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}

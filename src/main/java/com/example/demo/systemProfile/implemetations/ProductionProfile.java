package com.example.demo.systemProfile.implemetations;
import com.example.demo.systemProfile.SystemProfile;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}

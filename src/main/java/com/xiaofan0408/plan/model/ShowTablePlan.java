package com.xiaofan0408.plan.model;

public class ShowTablePlan extends Plan{

    private String database;

    public ShowTablePlan(String database){
        this.database = database;
    }
    
    public String getDatabase() {
        return database;
    }
}

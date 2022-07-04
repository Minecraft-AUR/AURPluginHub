package com.mcaur.cloud;

import static spark.Spark.get;

public class AURCloud {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}

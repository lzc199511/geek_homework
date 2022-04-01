package com.geek.homework4.two;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


    @Data
    @Component
    public class User {
        @Autowired
        private Cat cat;

        public Cat getCat() {
            return cat;
        }

        public void setCat(Cat cat) {
            this.cat = cat;
        }
    }


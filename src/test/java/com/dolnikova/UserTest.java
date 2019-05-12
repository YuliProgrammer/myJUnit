package com.dolnikova;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void isPasswordRight() {
        assertFalse(User.isPasswordRight("123"));
        assertFalse(User.isPasswordRight("12345678912345678912345"));
        assertFalse(User.isPasswordRight("asd_13_asdf"));
        assertFalse(User.isPasswordRight("ASDF13&KOG"));
        assertFalse(User.isPasswordRight("jhFdjg_jH"));
        assertFalse(User.isPasswordRight("Asdf13Okl"));

        assertFalse(User.isPasswordRight("jh 45K_xfgh"));
        assertFalse(User.isPasswordRight(" jh45K_xfgh "));
        assertFalse(User.isPasswordRight("ян12_sdfghA"));
        assertFalse(User.isPasswordRight("Ї12_sdfghA"));

        assertTrue(User.isPasswordRight("Java_2019"));
        assertTrue(User.isPasswordRight("Asd13?f15"));
        assertTrue(User.isPasswordRight("yuliProgrammer!17"));
    }

    @Test
    public void isEmailRight() {
        assertFalse(User.isPasswordRight("111@ghh.hf"));
        assertFalse(User.isPasswordRight("яо@ghh.hfgs"));
        assertFalse(User.isPasswordRight("kgkghh.hfgs"));
        assertFalse(User.isPasswordRight("fhb@ghhhfgs"));
        assertFalse(User.isPasswordRight("fhb@ghhh@f.gs"));
        assertTrue(User.isPasswordRight("yul iia@gmail.com"));

        assertTrue(User.isPasswordRight("dolnikova.yuliia@gmail.com"));
        assertTrue(User.isPasswordRight("java@gmail.com"));
    }
}
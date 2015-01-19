package com.squeezer.designpatterns;

import com.squeezer.designpatterns.template.Abstraction;
import com.squeezer.designpatterns.template.ConcreteClass;

public class TemplateMethodPatternMain {

    public static void main(String[] args) {

        Abstraction abstraction = new ConcreteClass();

        abstraction.templateOperation();

    }
}
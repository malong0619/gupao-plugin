package com.gupao;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;


@Mojo(name="gupaoml",defaultPhase = LifecyclePhase.PACKAGE)
public class GupaoMojo extends AbstractMojo {
    public void execute() {

        System.out.println("long ma create plugin");

    }
}

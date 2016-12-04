package ru.example.core;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public interface ModuleInterface extends InitializingBean, DisposableBean, Runnable {

	public String getName();

}
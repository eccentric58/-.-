package ru.liga.ppr.exam.task_3_inheritance.abstractions;

import ru.liga.ppr.exam.task_3_inheritance.enums.SwimType;

public abstract class Fish {

	public final SwimType swim() {
		throw  new UnsupportedOperationException();
	}

}

package com.javabrains;

import org.springframework.context.ApplicationEvent;

import java.security.PublicKey;

public class DrawEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public DrawEvent(Object source) {
        super(source);
    }

    public String toString() {
        return "Draw Event Occurred";
    }
}

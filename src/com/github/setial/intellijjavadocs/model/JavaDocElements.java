package com.github.setial.intellijjavadocs.model;

import org.jetbrains.annotations.NotNull;

public enum JavaDocElements {

    STARTING("/*"),
    ENDING("/"),
    NEW_LINE("\n"),
    TAG_START("@"),
    LINE_START("*"),
    WHITE_SPACE(" ");

    private String presentation;

    /**
     * Instantiates a new Java doc elements.
     *
     * @param s the S
     */
    JavaDocElements(String s) {
        presentation = s;
    }

    /**
     * Gets the presentation.
     *
     * @return the Presentation
     */
    @NotNull
    public String getPresentation() {
        return presentation;
    }

}
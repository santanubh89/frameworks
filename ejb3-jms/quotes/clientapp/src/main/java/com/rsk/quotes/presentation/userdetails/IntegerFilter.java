package com.rsk.quotes.presentation.userdetails;

import javafx.scene.control.TextFormatter;

import java.util.function.UnaryOperator;
import java.util.regex.Pattern;

public class IntegerFilter implements UnaryOperator<TextFormatter.Change> {
    private final static Pattern DIGIT_PATTERN = Pattern.compile("\\d*");

    @Override
    public TextFormatter.Change apply(TextFormatter.Change aT) {
        return DIGIT_PATTERN.matcher(aT.getText()).matches() ? aT : null;
    }
}

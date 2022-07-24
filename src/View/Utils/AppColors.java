package View.Utils;

import java.awt.*;

public enum AppColors {
    BACKGROUND_COLOR(248, 248, 248),
    PRIMARY_COLOR(254, 118, 85),
    SECONDARY_COLOR(128, 128, 128),
    GREEN_COLOR(2, 172, 83)
    ;

    AppColors(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    private final int r, g, b;
    public Color getColor(){return new Color(r,g,b);}
}

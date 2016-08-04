package com.samboluong.samboluong_wuziqi;

import android.graphics.Point;

import java.util.List;

public class Utils {

    public static boolean checkHorizontal(int x, int y, List<Point> points, int winCount) {
        int count = 1;
        for (int i = 1; i < winCount; i++) {
            if (points.contains(new Point((x - i), y))) {
                count++;
            } else {
                break;
            }
        }
        if (count == winCount) return true;
        for (int i = 1; i < winCount; i++) {
            if (points.contains(new Point(x + i, y))) {
                count++;
            } else {
                break;
            }
        }

        return count == winCount;
    }

    public static boolean checkVertical(int x, int y, List<Point> points, int winCount) {
        int count = 1;
        for (int i = 1; i < winCount; i++) {
            if (points.contains(new Point(x, y - i))) {
                count++;
            } else {
                break;
            }
        }
        if (count == winCount) return true;
        for (int i = 1; i < winCount; i++) {
            if (points.contains(new Point(x, y + i))) {
                count++;
            } else {
                break;
            }
        }

        return count == winCount;
    }

    public static boolean checkLeftDiagonal(int x, int y, List<Point> points, int winCount) {
        int count = 1;
        for (int i = 1; i < winCount; i++) {
            if (points.contains(new Point(x - i, y + i))) {
                count++;
            } else {
                break;
            }
        }
        if (count == winCount) return true;
        for (int i = 1; i < winCount; i++) {
            if (points.contains(new Point(x + i, y - i))) {
                count++;
            } else {
                break;
            }
        }

        return count == winCount;
    }

    public static boolean checkRightDiagonal(int x, int y, List<Point> points, int winCount) {
        int count = 1;
        for (int i = 1; i < winCount; i++) {
            if (points.contains(new Point(x + i, y + i))) {
                count++;
            } else {
                break;
            }
        }
        if (count == winCount) return true;
        for (int i = 1; i < winCount; i++) {
            if (points.contains(new Point(x - i, y - i))) {
                count++;
            } else {
                break;
            }
        }

        return count == winCount;
    }
}

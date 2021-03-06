package org.gli58.game;

import java.util.List;
import java.util.function.BiFunction;

@FunctionalInterface
interface MonsterMoveProvider extends BiFunction<Monster, List<Direction>, Direction> {
}

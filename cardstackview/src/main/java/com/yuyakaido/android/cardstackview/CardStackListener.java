package com.yuyakaido.android.cardstackview;

import android.view.View;

public interface CardStackListener {
    void onCardDragging(Direction direction, float ratio);
    CardStackListener DEFAULT = new CardStackListener() {
        @Override
        public void onCardDragging(Direction direction, float ratio) {
        }

        @Override
        public void onCardDraggingDetails(Direction directionVertical, Direction directionHorizontal,
                                          float ratioVertical, float ratioHorizontal) {
        }

        @Override
        public void onCardSwiped(Direction direction) {
        }

        @Override
        public void onCardSwipedDetails(Direction directionVertical, Direction directionHorizontal) {
        }

        @Override
        public void onCardRewound() {
        }

        @Override
        public void onCardCanceled() {
        }

        @Override
        public void onCardAppeared(View view, int position) {
        }

        @Override
        public void onCardDisappeared(View view, int position) {
        }
    };

    void onCardSwiped(Direction direction);

    void onCardDraggingDetails(Direction directionVertical, Direction directionHorizontal, float ratioVertical,
                               float ratioHorizontal);

    void onCardRewound();

    void onCardCanceled();

    void onCardAppeared(View view, int position);

    void onCardDisappeared(View view, int position);

    void onCardSwipedDetails(Direction directionVertical, Direction directionHorizontal);
}

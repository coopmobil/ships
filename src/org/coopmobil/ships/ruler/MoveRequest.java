package org.coopmobil.ships.ruler;

import java.util.UUID;

public class MoveRequest {
    private UUID playerId;
    private int shootCount;

    public MoveRequest(UUID playerId, int shootCount) {
        this.playerId = playerId;
        this.shootCount = shootCount;
    }

    public UUID getPlayerId() {
        return playerId;
    }

    public int getShootCount() {
        return shootCount;
    }
}

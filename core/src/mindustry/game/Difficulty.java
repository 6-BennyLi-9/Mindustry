package mindustry.game;

import arc.*;

public enum Difficulty{
    //TODO these need tweaks
    casual(0.75f, 0.5f, 2f, 1.8f),
    easy(1f, 0.75f, 1.5f, 1f),
    normal(1f, 1f, 1f, 0.8f),
    hard(1.25f, 1.5f, 0.8f, 0.5f),
    eradication(1.5f, 2f, 0.6f, 0.3f);

    public static final Difficulty[] all = values();

    //TODO add more fields
    public final float enemyHealthMultiplier;
    public final float enemySpawnMultiplier;
    public final float waveTimeMultiplier;
    public final float playerDamageMultiplier;

    Difficulty(float enemyHealthMultiplier, float enemySpawnMultiplier, float waveTimeMultiplier, float playerDamageMultiplier){
        this.enemySpawnMultiplier = enemySpawnMultiplier;
        this.waveTimeMultiplier = waveTimeMultiplier;
        this.enemyHealthMultiplier = enemyHealthMultiplier;
        this.playerDamageMultiplier = playerDamageMultiplier;
    }

    public String localized(){
        return Core.bundle.get("difficulty." + name());
    }
}

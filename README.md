# Example Mod

For `mod_id`:
- Rename `mod-template/src/main/resources/assets/*mod_id*`
- Rename `mod-template/src/main/resources/*mod_id*.mixins.json`

In `gradle.properties`:
- Change `archives_base_name`
- Change `mod_version`
- Check `minecraft_version`
- Check `yarn_mappings`
- Check `loader_version`
- Check `fabric_version`

In `src/main/resources/mod_id.mixins.json`:
- Change `mod_id` in `package`
- Check `client`

In `src/main/resources/fabric.mod.json`:
- Change `mod_id`
- Change `name`
- Change `description`
- Change `sources` in `contact`
- Change `mod_id` in `icon`
- Change `mod_id` in `main` in `entrypoints`
- Change `mod_id` in `mixins`
- Check `depends`

Example files:
- `src/main/java/net/avcd/mod_id/ExampleMod.java` \
    `ExampleMod` in `fabric.mod.json` in `entrypoints` in `main`

- `src/main/java/net/avcd/mod_id/mixin/ExampleMixin.java` \
    `ExampleMixin` in `mod_id.mixins.json` in `client`

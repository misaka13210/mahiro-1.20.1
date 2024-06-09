package name.mahiro.registry;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Lifecycle;
import name.mahiro.Mahiro;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.entry.RegistryEntryOwner;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.structure.OceanRuinStructure;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class ModItems {

    public static Item registerItem(String name,Item item,ItemGroup...itemGroups) {
        Item registerItem = new Registry(Registries.ITEM, new Identifier(Mahiro.MOD_ID, name), item) {
            @NotNull
            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public RegistryKey<? extends Registry> getKey() {
                return null;
            }

            @Nullable
            @Override
            public Identifier getId(Object value) {
                return null;
            }

            @Override
            public Optional<RegistryKey> getKey(Object entry) {
                return Optional.empty();
            }

            @Override
            public int getRawId(@Nullable Object value) {
                return 0;
            }

            @Nullable
            @Override
            public Object get(int index) {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Nullable
            @Override
            public Object get(@Nullable RegistryKey key) {
                return null;
            }

            @Nullable
            @Override
            public Object get(@Nullable Identifier id) {
                return null;
            }

            @Override
            public Lifecycle getEntryLifecycle(Object entry) {
                return null;
            }

            @Override
            public Lifecycle getLifecycle() {
                return null;
            }

            @Override
            public Set<Identifier> getIds() {
                return Set.of();
            }

            @Override
            public Set<Map.Entry> getEntrySet() {
                return Set.of();
            }

            @Override
            public Set<RegistryKey> getKeys() {
                return Set.of();
            }

            @Override
            public Optional<RegistryEntry.Reference> getRandom(Random random) {
                return Optional.empty();
            }

            @Override
            public boolean containsId(Identifier id) {
                return false;
            }

            @Override
            public boolean contains(RegistryKey key) {
                return false;
            }

            @Override
            public Registry freeze() {
                return null;
            }

            @Override
            public RegistryEntry.Reference createEntry(Object value) {
                return null;
            }

            @Override
            public Optional<RegistryEntry.Reference> getEntry(int rawId) {
                return Optional.empty();
            }

            @Override
            public Optional<RegistryEntry.Reference> getEntry(RegistryKey key) {
                return Optional.empty();
            }

            @Override
            public RegistryEntry getEntry(Object value) {
                return null;
            }

            @Override
            public Stream<RegistryEntry.Reference> streamEntries() {
                return Stream.empty();
            }

            @Override
            public Optional<RegistryEntryList.Named> getEntryList(TagKey tag) {
                return Optional.empty();
            }

            @Override
            public RegistryEntryList.Named getOrCreateEntryList(TagKey tag) {
                return null;
            }

            @Override
            public Stream<Pair<TagKey, RegistryEntryList.Named>> streamTagsAndEntries() {
                return Stream.empty();
            }

            @Override
            public Stream<TagKey> streamTags() {
                return Stream.empty();
            }

            @Override
            public void clearTags() {

            }

            @Override
            public RegistryEntryOwner getEntryOwner() {
                return null;
            }

            @Override
            public RegistryWrapper.Impl getReadOnlyWrapper() {
                return null;
            }

            @Override
            public void populateTags(Map tagEntries) {

            }
        };
    }
}

package ru.practicum.item;

public class ItemMapper {
    static Item toItem(ItemDto dto) {
        Item item = new Item();
        item.setUserId(dto.getUserId());
        item.setUrl(dto.getUrl());
        item.setTags(dto.getTags());
        return item;
    }

    static ItemDto toDto(Item item) {
        ItemDto dto = new ItemDto(
                item.getId(),
                item.getUserId(),
                item.getUrl(),
                item.getTags()
        );
        return dto;
    }
}

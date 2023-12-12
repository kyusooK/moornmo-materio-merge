<script setup>
import {
  VerticalNavLink,
  VerticalNavSectionTitle,
} from '@layouts'
</script>

<template>
    <ul>
        <VerticalNavSectionTitle :item="{ heading: 'Basic' }" />
        <VerticalNavLink
            :item="{
                title: '회사정보',
                to: '/companies',
            }"
        />
        <VerticalNavLink
            :item="{
                title: '상품 정보',
                to: '/products',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Sales' }" />
        <VerticalNavLink
            :item="{
                title: '수주정보',
                to: '/salesOrders',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Inventory' }" />
        <VerticalNavLink
            :item="{
                title: '재고',
                to: '/inventories',
            }"
        />
    </ul>
</template>

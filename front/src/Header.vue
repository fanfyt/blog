<template>
  <header class="header">
    <div class="logo">
      <!-- Logo -->
      <slot name="logo">
<!--        <img src="/path/to/default-logo.svg" alt="Default Logo" />-->
      </slot>
    </div>
    <nav class="navigation">
      <!-- Navigation items -->
      <slot name="navigation">
        <ul>
          <li><a href="/">Home</a></li>
          <li><a href="/about">About</a></li>
          <li><a href="/contact">Contact</a></li>
        </ul>
      </slot>
    </nav>
  </header>
</template>

<script>
export default {
  name: 'Header',
}
</script>

<style scoped>
.header {
  background-color: #f5f5f5;
  padding: 1rem;
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.logo {
  /* Logo styles */
}

.navigation {
  /* Navigation styles */
}
</style>
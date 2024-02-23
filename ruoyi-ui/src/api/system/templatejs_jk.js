import request from '@/utils/request'

// 查询金控列表
export function listTemplatejs_jk(query) {
  return request({
    url: '/system/templatejs_jk/list',
    method: 'get',
    params: query
  })
}

// 查询金控详细
export function getTemplatejs_jk(id) {
  return request({
    url: '/system/templatejs_jk/' + id,
    method: 'get'
  })
}

// 新增金控
export function addTemplatejs_jk(data) {
  return request({
    url: '/system/templatejs_jk',
    method: 'post',
    data: data
  })
}

// 修改金控
export function updateTemplatejs_jk(data) {
  return request({
    url: '/system/templatejs_jk',
    method: 'put',
    data: data
  })
}

// 删除金控
export function delTemplatejs_jk(id) {
  return request({
    url: '/system/templatejs_jk/' + id,
    method: 'delete'
  })
}

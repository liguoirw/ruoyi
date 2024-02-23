import request from '@/utils/request'

// 查询机具模版列表
export function listTemplatejj(query) {
  return request({
    url: '/system/templatejj/list',
    method: 'get',
    params: query
  })
}

// 查询机具模版详细
export function getTemplatejj(id) {
  return request({
    url: '/system/templatejj/' + id,
    method: 'get'
  })
}

// 新增机具模版
export function addTemplatejj(data) {
  return request({
    url: '/system/templatejj',
    method: 'post',
    data: data
  })
}

// 修改机具模版
export function updateTemplatejj(data) {
  return request({
    url: '/system/templatejj',
    method: 'put',
    data: data
  })
}

// 删除机具模版
export function delTemplatejj(id) {
  return request({
    url: '/system/templatejj/' + id,
    method: 'delete'
  })
}
